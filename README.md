# issues-kotlin-inference

Sample code for an issue with generic types inference in kotlin 1.3.72.

|Kotlin|New inference algorithm|Result|
|:-------|-------|-------|
|1.3.71|No | OK
|1.3.71|Yes| OK
|1.3.72|No | OK
|1.3.72|Yes| Error
|1.4-M1|N/A| OK
