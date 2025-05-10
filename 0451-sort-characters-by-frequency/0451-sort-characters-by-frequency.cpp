class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> frequencyMap;
        for (char ch : s) {
            ++frequencyMap[ch];
        }
        vector<char> uniqueChars;
        for (auto& keyValue : frequencyMap) {
            uniqueChars.push_back(keyValue.first);
        }
        sort(uniqueChars.begin(), uniqueChars.end(), [&](char a, char b) {
            return frequencyMap[a] > frequencyMap[b];
        });
        string result;
        for (char ch : uniqueChars) {
            result += string(frequencyMap[ch], ch);
        }
        return result;
    }
};