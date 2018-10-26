# TCL4 NUSS-Operator Interface


## Conformance
If an active operation violates its conformance geography, there will be a trigger in the UTM System to mark that operation as nonconforming.

The UTM System will define an additional region around the conformance geography called the protected geography. This volume will be used by the UTM System to strategically deconflict operations from each other and other constraints in the system.

![alt text](https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/nuss-operator-api/images/conformance-regions.png "geometries")

**Figure 1: Geometries of Flight, Conformance and Protected
**
### Conformance Parameters

NUSS supports binding conformance parameters at runtime; for example, the properties may be informed by an SDSP based on weather or surveillance findings. The default properties are externalized in NUSS's application properties files and are bound at launch time.

The update rate for position reports is at least 1 Hz to no more than 5 Hz. In the case that there are too few reports per second, the UTM System will transition the operation to the NONCONFORMING state and notify the UAS Operator.


If an operation ever breaches its assigned protected geography, it will immediately be transitioned to the ROGUE state



## Operator Operation States

Operator-API Operation States are shown in Figure 1.  Note that Non-conforming to Closed is a valid state transition but is not captured this diagram.


![alt text](https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/nuss-operator-api/images/tcl4states.png "TCL4 FSM")

**Figure 2: Operator-API Operation States
**




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

 **Table 1: Operator-API Operation States
**
