#! /usr/bin/env python

# This script takes student submissions in SRC directory, executes them,                        
# captures the output, and copies the output to a DST directory.                                
# Assumes the following directory layout:
# SRC/p#/student_name/{submission_files}
# DST/p#/{output files for all students}                                                             
#                 
# by Mark Sherman, msherman@cs.uml.edu  
#
# r2012.07.07   - v1 based on "getassignment" 
                                       

import os 
import getopt
import sys

from glob import glob
from subprocess import call

#SRC = '/Users/mark/Documents/Research/auto assessment/101S12/'
#DST = '/Users/mark/Documents/Research/auto assessment/scripts/data/'

SRC = '/home/jdefilip/Dropbox/auto assessment/101S12/'
DST  = '/home/jdefilip/Dropbox/auto assessment/output_comparison/test_dir/'

# Process arguments
# a : assignment name
# s : student username
opts, args = getopt.getopt(sys.argv[1:], 'a:s:')
assign = stud = ''
for o, x in opts:
    if o == '-a':
        assign = x
    elif o == '-s':
        stud = x
    else:
        assert False, "unhandled option " + o

# Takes the specified student/assignment and extracts it
def getFile(assignment, student):
    
    #ZOMG per-assignment constants
    n = '1' #assignment number, for build script
    run_args = []   #arguments for running student program
    case_num = '1'
    
    srcdir = SRC + assignment + '/' + student + '/'
    print "srcdir = " + srcdir
    os.chdir(srcdir)
    
    # Creates the destination directory
    # Will create directory if it doesn't exist
    curdir = DST + assignment + '/'
    print "destination = " + curdir
    if not os.access( curdir , os.F_OK):
        print 'Making directory ' + curdir
        os.mkdir( curdir )

    # Build program with Make
    print "Making program for " + student
    build_command = ['gcc','-Wall','-ansi', 'p' + n + '.c', '-o', 'a' + n]
    build_status = call(build_command)

    # Run the program with test data
    if build_status == 0 :
        executable = 'a' + n
        stdin_file = open('/Users/mark/Documents/Research/auto assessment/scripts/stdinfile', 'r')
        stdout_file = open(curdir + case_num + student + '.out', 'w')
        
        call_args = [srcdir + executable] + run_args
        call(call_args, stdin=stdin_file, stdout=stdout_file)
        
        stdin_file.close()
        stdout_file.close()
                

# Do the things
if assign == '' and stud == '':
    print "Nothing specified"

elif assign != '' and stud != '':
    print 'Getting individual ' + assign + ' ' + stud
    getFile(assign, stud)
    
elif assign != '' and stud == '':
    print 'Getting assignment ' + assign
    srcdir = SRC + assign + '/'
    for x in glob( srcdir + '*'):
        getFile( assign, x[ len(srcdir): ] )

else:
    print 'Not sure what to do. Exiting.'
