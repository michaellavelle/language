# verbs

Initial prototype functionality for conjugating English verbs ( British English).

Some messy code in VerbConjugationLogic - to be tidied up and moved into the verb conjugators.

Lots of logic branches - some with inclusions for suffices - could be negated to use exclusions instead.

I plan on re-working this logic with the aim of obtaining the simplest logic to conjugate regular verbs.

Tested on the entire alphabet of a dataset of verbs I have locally ( not an exhaustive list by any means),
but so far I've only committed the set of verbs starting "a" - with more to add over time.

Notably missing from the list of verbs so far is the verb "to be" - which needs to be handled separately,
as it depends on first,second or third person, and singular or plural - TODO