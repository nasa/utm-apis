# TCL4 NUSS-Operator Interface
## States


![alt text](https://raw.githubusercontent.com/nasa/utm-apis/v4-draft/nuss-operator-api/images/tcl4states.png "TCL4 FSM")


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

## Conformance

NUSS supports binding conformance parameters at runtime; for example, the properties may be informed by an SDSP based on weather or surveillance findings. The default properties are externalized in NUSS's application properties files and are bound at launch time.

The update rate for position reports is at least 1 Hz to no more than 5 Hz. In the case that there are too few reports per second, the UTM System will transition the operation to the NONCONFORMING state and notify the UAS Operator. The UAS Operator will have 60 seconds to remedy the issue or CLOSE the operation. If the position reports are still not received at the rate of at least 1 Hz after 60 seconds, then the operation will be transitioned to the ROGUE state. When the operation begins sending position reports at the correct rate, it must maintain that rate for 60 seconds before NUSS will transition that operation back to the ACTIVATED state.

If an operation ever breaches its assigned protected geography, it will immediately be transitioned to the ROGUE state
