# pulumi-tutorial

## Setup pulumi

1. Pulumi account einrichten (wir nutzen hier die Pulumi-Cloud)
1. AWS profil einrichten (Accec-Key und Secret-Key für technischen User im Sandbox account)
1. Profile mit aws cli wechseln

## Setup projet

1. mkdir \<Projekt-name\> && cd \<Projekt-name\>
1. pulumi new aws-java
    - Jetzt werdet ihr nach einigen Imformationen zum Projekt gefragt

## Dateien
1. Pulumi.yaml
    - Enthält alle Informationen über das Projekt (z.B. Name, Runtime usw.)
1. Pulumi.\<stack\>.yaml
    - Enthält die Konfiguration eines Stack
    - Secrect, Variablen usw.

## Konfigurieren eines Projektes
1. Variablen
    - pulumi config set \<key\> \<value\>