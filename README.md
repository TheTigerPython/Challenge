Challenge for: https://slothbytes.beehiiv.com/

Task:

Create a function that returns true if two lines rhyme and false otherwise. For the purposes of this exercise, two lines rhyme if the last word from each sentence contains the same vowels.

Examples:

doesRhyme("Sam I am!", "Green eggs and ham.")
output = True
doesRhyme("Sam I am!", "Green eggs and HAM.")
output = True
# Capitalization and punctuation should not matter.
doesRhyme("You're built like a seat", "I bet you like to eat")
output = True
doesRhyme("You are off to the races", "a splendid day.")
output = False
doesRhyme("and frequently do?", "you gotta move.")
output = False

Notes:

- Case insensitive.

- Here we are disregarding cases like "thyme" and "lime".

- We are also disregarding cases like "away" and "today" (which technically rhyme, even though they contain different vowels).
