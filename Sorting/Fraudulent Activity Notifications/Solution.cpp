#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> split_string(string);
double calcMedian(vector<int>);

// Complete the activityNotifications function below.
int activityNotifications(vector<int> expenditure, int d) {


  cout << "Expenditures: ";
  for (int i = 0; i < expenditure.size(); ++i) {
    cout << expenditure[i] << " ";
  }


  int notices = 0;
  double median, lastMedian = 0;
  vector<int> trailingExpenditures(expenditure.begin(), expenditure.begin() + d);
  vector<int> trailingExpendituresSorted(expenditure.begin(), expenditure.begin() + d);
  sort(trailingExpendituresSorted.begin(), trailingExpendituresSorted.end());

  auto pos = std::find_if(trailingExpendituresSorted.begin(), trailingExpendituresSorted.end(), [ns](auto s) {
      return s < ns;
  });

  for (vector<int>::iterator it = expenditure.begin() + d; it != expenditure.end(); ++it) {

    cout << "\nCurrent day: " << *it << ", ";
    cout << "Trailing: ";

    size_t trailingSize = trailingExpenditures.size();

    for (int i = 0; i < trailingExpenditures.size(); ++i) {
      cout << trailingExpenditures[i] << " ";
    }
    lastMedian = median;
    median = calcMedian(trailingExpenditures);

    if (trailingSize % 2 == 0) {
      // Figure out average of middle elements
    } else {
      median = trailingExpenditures[trailingSize / 2]
    }

    cout << ", Median: " << median;
    cout << ", lastMedian: " << lastMedian;

    if (*it >= median * 2) { notices++; }
    rotate(trailingExpenditures.begin(), trailingExpenditures.begin() + 1, trailingExpenditures.end());
    trailingExpenditures[trailingExpenditures.size() - 1] = *it;
  }

  cout << "\n";

  return notices;
}

int main()
{
    string nd_temp;
    getline(cin, nd_temp);

    vector<string> nd = split_string(nd_temp);

    int n = stoi(nd[0]);

    int d = stoi(nd[1]);

    string expenditure_temp_temp;
    getline(cin, expenditure_temp_temp);

    vector<string> expenditure_temp = split_string(expenditure_temp_temp);

    vector<int> expenditure(n);

    for (int i = 0; i < n; i++) {
        int expenditure_item = stoi(expenditure_temp[i]);

        expenditure[i] = expenditure_item;
    }

    int result = activityNotifications(expenditure, d);

    cout << result << "\n";

    return 0;
}

vector<string> split_string(string input_string) {

    // Iterator function for removing consecutive whitespaces
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    // Remove consecutive whitespaces
    input_string.erase(new_end, input_string.end());

    // Remove trailing whitespaces
    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    // Check the position of each whitespace and add the string character before that
    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    // Add the final element
    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}

double calcMedian(vector<int> values) {
  size_t size = values.size();

  if (size == 0) { return 0; }
  else
  {
    sort(values.begin(), values.end());
    if (size % 2 == 0)
    {
      // Average of middle elements
      return (values[size / 2 - 1] + values[size / 2]) / (double) 2;
    }
    else
    {
      // Middle element
      return values[size / 2];
    }
  }
}
