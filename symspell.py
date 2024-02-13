class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end_of_word = False
        self.frequency = 0

class SymSpell:
    def __init__(self, max_edit_distance=2):
        self.max_edit_distance = max_edit_distance
        self.root = TrieNode()
    
    def insert_word(self, word, frequency):
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
        node.is_end_of_word = True
        node.frequency = frequency
    
    def get_suggestions(self, word):
        suggestions = set()
        self.search(self.root, word, "", 0, suggestions)
        return suggestions
    
    def search(self, node, word, prefix, edit_distance, suggestions):
        if edit_distance > self.max_edit_distance:
            return
        if node.is_end_of_word and abs(len(word) - len(prefix)) <= self.max_edit_distance:
            suggestions.add(prefix)
        if not word:
            return
        for char in node.children:
            if word[0] == char:
                self.search(node.children[char], word[1:], prefix + char, edit_distance, suggestions)
            elif edit_distance < self.max_edit_distance:
                self.search(node.children[char], word[1:], prefix + char, edit_distance + 1, suggestions)
                self.search(node.children[char], word, prefix + char, edit_distance + 1, suggestions)
                self.search(node.children[char], word[1:], prefix + char, edit_distance + 1, suggestions)

# Example usage:
sym_spell = SymSpell()

# Example words to add to dictionary
words = [("apple", 100), ("banana", 200), ("orange", 150), ("pear", 180), ("grape", 170), ("watermelon", 220), ("pineapple", 190)]

# Add words to dictionary
for word, frequency in words:
    sym_spell.insert_word(word, frequency)

# Example word to get suggestions for
word_to_check = "aple"
suggestions = sym_spell.get_suggestions(word_to_check)
print("Word:", word_to_check)
print("Suggestions:", suggestions)
