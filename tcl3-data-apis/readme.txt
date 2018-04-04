This document describes the procedures for transmitting UTM TCL3 data to NASA.
The requirements for the individual MOPS (CNS1,SAA2, etc.) have been transmitted previously in the form of a table.

Instructions
There are two types of submissions.

*Type: Vehicle-Centric*

In this type, a vehicle (uvin) submits a flight plan (gufi) and performs one or more tests.  For each gufi flown, you must submit a FLIGHT_DATA json file described here: https://app.swaggerhub.com/apis/utm/tcl3-flight-data

For each test performed during this flight you must submit a corresponding json file.  The naming conventions that will be used are:

{yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM}-{MOPnameAndNumber}.json
        e.g:        UASORG-20180415-1320-FLIGHT_DATA.json
	e.g:        UASORG-20180415-1320-CNS1.json	
        e.g:        UASORG-20180329-1945-SAA3.json
        e.g:        UASORG-20180401-1655-CON5.json

For each gufi, assemble all files (*.json, *.pdf, *kml, *.bin, etc) into a single folder and zip it.  The zip folder should be named as follows: 

Compressed file name format:   {yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM}-{MOPtestsDone}.zip
        e.g.        UASORG-20180415-1320-CNS1CNS2SAA5.zip
        e.g.        UASORG-20180329-1945-SAA1SAA2SAA3SAA6CON1.zip

Note 1: in FLIGHT_DATA, in the field testIdentifiers, we will examine this field to determine if you have submitted the required test files.  For example, if you specify CNS1, we will look for a file like UASORG-20180415-1320-CNS1.json.  If the file is not found, the submission will be rejected and you will recieve an email notification.  

Note 2: For test sites performing the CNS3 test, use the following name convention for RF files:
 
File name format:           
UTM-{yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM }-{freq.MHz}-{samplingRateSPS}-rfData.bin
e.g.         For a signal of 725MHz at 2G samples/sec:                           UTM-NYUASTS-20180326-1455-725MHz-2GSPS-rfData.bin
Note: Use the appropriate binary file extension  (e.g. *.bin, *.dat, *txt, etc)

*Type: USS-Centric*
This type corresponds to the DAT MOPS.  Specifically, DAT 2,3,4,5,99.
In this type, submit one zip file for each USS instance.  A USS instance may perform one or more DAT tests, one or more times.





