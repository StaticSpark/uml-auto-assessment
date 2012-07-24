#! /usr/bin/env python 
import sys

def str_is_digit(s): return s.isdigit()

def compare_numeric(reference_file, student_file): 

    DEBUG = 0
    reference_output_string = reference_file.read()
    student_output_string = student_file.read()
    
    reference_output = reference_output_string.split() 
    student_output = student_output_string.split()

    if DEBUG > 0 :
        print reference_output
        print student_output
        
    reference_output_sanitized = filter(str_is_digit, reference_output)
    student_output_sanitized = filter(str_is_digit, student_output)

    if DEBUG > 0 :
        print reference_output_sanitized
        print student_output_sanitized

    if reference_output_sanitized == student_output_sanitized :
        print "PASS" 
    else:
        print "FAIL"
    
    return
