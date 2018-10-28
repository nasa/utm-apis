# TCL4 NUSS-Operator Interface


## Conformance
If an active operation violates its conformance geography, operation as nonconforming.
NUSS defines an additional region around the conformance geography called the protected geography. This volume is used to strategically deconflict operations from each other as well as from airspace constraints.

![alt text](https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/nuss-operator-api/images/opVol-tcl4.png  "geometries")

**Figure 1: Geometries of Flight, Conformance and Protected**

### Conformance Monitoring

Figure 2 lists default values for NUSS's conformance parameters. Theses defaults are bound at launch time. Additionally NUSS can bind conformance parameters at runtime; for example, conformance properties may be informed by an SDSP based on weather or surveillance findings.

The update rate for position reports is at least 1 Hz to no more than 5 Hz. In the case that there are too few reports per second, the UTM System will transition the operation to the NONCONFORMING state and notify the UAS Operator.

The conformance expand the operator's geography to a 4d conformance volume.  A position within this region will trigger an Active to Non-Conformant state change. Similarly the protected buffers expand the conformance geography to define a the protected volume.
If an operation ever breaches its assigned protected geography, it will immediately be transitioned to the ROGUE state The protected volume is used for Strategic Deconfliction.

minimum.altitude.feet is global to NUSS to define the a total minimum.

reportingFrequency.minimum.hz specifies the max interval between position reports. This interval will trigger Active to Non-conformat, and eventually Non-conformant to Rogue.


          reportingFrequency.minimum.hz
          minimum.altitude.feet:-250
          conformance.lateral.feet:30
          conformance.altitude.feet:20
          conformance.time.ms:60000
          protected.lateral.feet:60
          protected.altitude.feet:20
          protected.time.ms:60000

**Figure 2: Default Conformance Values**


## Operator Operation States

Operator-API Operation States are shown in Figure 1.  Note that Non-conforming to Closed is a valid state transition but is not captured this diagram.


![alt text](https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/nuss-operator-api/images/tcl4states.png "TCL4 FSM")

**Figure 2: Operator-API Operation States**


Abbreviation | State
------------ | -------------
 P  | PROPOSED
 A  |  ACCEPTED   
 R  | REJECTED - terminal
 C   | CLOSED  - terminal
 X   | CANCELED  - terminal
 I   | READIED   
 E   | EXPIRED  - terminal
 G   | ROGUECLOSED  - terminal
 B   | ABORTCLOSED - terminal
 U  | ROGUE
 T  | ABORTING
 F  | NON-CONFORMING
 V  | ACTIVE

 **Table 2: Operator-API Operation State Abbreviations**
