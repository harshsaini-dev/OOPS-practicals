# Lab Sheet 08 — JavaBeans and Networking (20 questions)

Compile all programs with `javac *.java`; run a bean using `java Q01` through `java Q11`.

Networking exercises are intended to be run using **two terminals**.

- Q12 (one-shot TCP server, 5000): start `java Q12`, then `java Q13` in another terminal. Q12 accepts a connection without reading the message (as Q12 asks).
- Q14 (server reading a client message, 5000): start `java Q14`, then `java Q13`. Do not run Q12 and Q14 together on port 5000.
- Q15 (echo TCP server, 5001): start `java Q15`, then `java EchoClient`.
- Q17 (UDP receiver, 6000): start `java Q17`, then `java Q16`.
- Q20 (multiple clients, 5002): start `java Q20`, then start `java MultiClient` several times. Press Ctrl+C to stop the persistent server.
- Q18 needs a network connection and uses the URL requested by the sheet: `http://example.com`. Network policy may block it.
- Q19 uses the exact illustrative URL in the assignment, `https://www.example.com/sample.txt`, which may not exist (HTTP 404). Replace it with an actual approved download URL to demonstrate successful downloading.

**Security:** The network examples are localhost-only clients and classroom demonstrations; TCP listeners may bind to all local interfaces. Do not expose these ports to untrusted networks. Passwords in Q05 are demonstrative; real systems need salted password hashes and protected secrets.
