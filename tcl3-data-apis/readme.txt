This document describes the procedures for transmitting UTM TCL3 data to NASA.
The requirements for the individual MOPS (CNS1,SAA2, etc.) have been transmitted previously in the form of a table.  They are also located in the git repository located at https://github.com/nasa/utm-apis

Instructions

Part I: CNS, SAA, and CON
CNS, SAA, and CON tests are vehicle-centric.  In these scenario, a vehicle (uvin) submits a flight plan (gufi) and performs one or more tests (for example CNS1 and SAA2).  For each gufi flown, you must generate a single zip file.  The contents of this zip file MUST contain
(A) a single FLIGHT_DATA json file
(B) a single json file for EACH test performed during this gufi.  For example: if you perform CNS1, you must generate a file containing the json object CNS1_MOP (See swaggerhub for data model definitions)
(C) if applicable, associated non-JSON files such as pdf, kml, bin etc.

Format:
(1) For FLIGHT_DATA files, use the following naming convention:
{yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM }-{FLIGHT_DATA}.json
e.g.	UASORG-20180415-1320-FLIGHT_DATA.json

(2) For the individual MOP files use the following naming convention:
MOP file name format:  {yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM }-{MOPnameAndNumber}.json
        e.g:        UASORG-20180415-1320-CNS1.json
        e.g:        UASORG-20180329-1945-SAA3.json
        e.g:        UASORG-20180401-1655-CON5.json

(3) For test sites doing the CNS3_MOP test, use the following name convention for RF files:
File name format:           
- If you are submitting a single RF file, use the following file format: 
UTM-{yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM }.bin
		e.g.		UTM-UASORG-20180231-1459-rfData.bin'
- If multiple RF files were captured at the same date/time, use the following format:
UTM-{yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM }-{freq.MHz}-{samplingRateSPS}-rfData.bin
		e.g.         For a signal of 725MHz at 2G samples/sec: UTM-NYUASTS-20180326-1455-725MHz-2GSPS-rfData.bin
Note: Use the appropriate binary file extension  (e.g. *.bin, *.dat, *txt, etc)

(4) PDF Files for CNS
As explained in the template “UTM-TCL3-DMP-RevF-CNS.pptx”, use the following convention to name your 'UTM-TCL3-DMP-RevF-CNSPDF' PDF file:
CNS PDF file name format:	UTM-{yourOrganizationName}-CNS-{0} or{1,2…n}.pdf
Examples:
- If all the CNS flight (i.e. GUFI) PDF files have the same content then the file name will be:	UTM-UASORG-CNS-0.pdf 
- If a few the CNS flight (i.e. GUFI) PDF files have the same content then each version of the file name will be:	UTM-UASORG-CNS-1.pdf, UTM-UASORG-CNS-2.pdf, UTM-UASORG-CNS-3.pdf  …. n.pdf
- If all the CNS flight (i.e. GUFI) PDF files have different content then each file name will be:	UTM-UASORG-CNS-1.pdf, UTM-UASORG-CNS-2.pdf, UTM-UASORG-CNS-3.pdf …. n.pdf

(5) PDF Files for CON
As explained in the template “UTM-TCL3-DMP-RevF-CON.pptx”, use the following convention to name your 'UTM-TCL3-DMP-RevF-CONPDF' PDF file:
CON PDF file name format:	UTM-{yourOrganizationName}-CON-{0} or{1,2…n}.pdf
Examples:
- If all the CON flight (i.e. GUFI) PDF files have the same content then the file name will be:	UTM-UASORG-CON-0.pdf 
- If a few CON flight (i.e. GUFI) PDF files have the same content then each version of the file name will be:	UTM-UASORG-CON-1.pdf, UTM-UASORG-CON-2.pdf, UTM-UASORG-CON-3.pdf  …. n.pdf
- If all the CON flight (i.e. GUFI) PDF files have different content then each file name will be:	UTM-UASORG-CON-1.pdf, UTM-UASORG-CON-2.pdf, UTM-UASORG-CON-3.pdf  …. n.pdf

(6) For test sites performing the CON2 and/or CON4 tests, use the following convention to name your 'UTM-TCL3-DMP-RevF-CONKML' files:
File name format:
UTM-{yourOrganizationName}-CON-{0} or{1,2…n}.kml
Example:
- If all the CON flight (i.e. GUFI) KML files have the same content then the file name will be:
UTM-UASORG-CON-0.kml
- If a few CON flight (i.e. GUFI) KML files have the same content then each version of the file name will be:
UTM-UASORG-CON-1.kml, UTM-UASORG-CON-2.kml, UTM-UASORG-CON-3.kml …. n.kml
- If all the CON flight (i.e. GUFI) PDF files have different content then each file name will be:
UTM-UASORG-CON-1.kml, UTM-UASORG-CON-2.kml, UTM-UASORG-CON-3.kml …. n.kml

(7) PDF Files for SAA
As explained in the template “UTM-TCL3-DMP-RevF-SAA.pptx”, use the following convention to name your 'UTM-TCL3-DMP-RevF-SAAPDF' PDF files:
UTM-{yourOrganizationName}-SAA-{0} or{1,2…n}.pdf
Examples:
- If all the SAA flight (i.e. GUFI) PDF files have the same content then the file name will be UTM-UASORG-SAA-0.pdf 
- If a few SAA flight (i.e. GUFI) PDF files have the same content then each version of the file name will be                            UTM-UASORG-SAA-1.pdf, UTM-UASORG-SAA-2.pdf, UTM-UASORG-SAA-3.pdf  …. n.pdf
- If all the CNS flight (i.e. GUFI) PDF files have different content then each file name will be UTM-UASORG-SAA-1.pdf, UTM-UASORG-SAA-2.pdf, UTM-UASORG-SAA-3.pdf  …. n.pdf

(8) In order to complete the flight report, all of the MOP files (*.json, *.pdf, *kml, *.bin, etc) should be packaged into a single compressed file (*.zip), with the following name convention:

Compressed file name format:   {yourOrganizationName}-{dateOfFlightInYYYYMMDD}-{UTCtakeoffTimeInHHMM}-{MOPtestsDone}.zip
e.g. UASORG-20180415-1320-CNS1CNS2SAA5.zip
e.g. UASORG-20180329-1945-SAA1SAA2SAA3SAA6CON1.zip

submit a FLIGHT_DATA json file described here: https://app.swaggerhub.com/apis/utm/tcl3-flight-data

Upload Process
(1) Go to utmregistry.arc.nasa.gov
(2) Find the relevant vehicle (uvin)
(3) For each gufi generate a zip folder as described above
(4) click select file and upload


Part II: DAT
The DAT MOPS are USS-centric.  They are not necessarily bound to a particular (uvin,gufi) pair.  They are generally bound to a USS Instance and a corresponding flight test card.

DAT4:
This MOP involves UAS_ID performance metrics.  For each USS Instance, generate one and only one DAT4 json file that contains the DAT4 json data model.  Name the file
{ussName}-{ussInstanceID}-DAT4.json
In this data model, the (uvin,gufi) pair corresponds to the vehicle being identified.  It therefore must be a valid uvin and gufi submitted to some USS.  In addition, since we will require data from this vehicle, the operator of this vehicle must submit a single zip file containing FLIGHT_DATA (see above).  If this is not clear, please contact the DMP team.

DAT99:
For each USS Instance, generate one and only one DAT99 json file that contains the DAT99 json data model.  In this case, there is only a single json object for each file since this MOP measures temporal metrics associated with the registration of a USS instance and this can only happen once.

For each instance there will be a DAT4 or DAT99 or both associated with it.  Create zip folder and put these files (at most 2) in it.  Name the zip folder
{ussName}-{ussInstanceID}-DAT4_99.zip
Create a zip folder for each instance that performed these tests.

For DAT2-3 and DAT5.  Create a single file containing the json data models described in
https://app.swaggerhub.com/domains/utm/tcl3-dat-test-schema/v1
for each USS instance.  Package all of these files in a single zip folder and name it
{ussName}-DAT2_3_5.zip and upload it to the site.








