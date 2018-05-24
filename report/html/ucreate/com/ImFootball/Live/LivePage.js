var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":41,"methods":[{"el":24,"sc":1,"sl":22},{"el":28,"sc":1,"sl":25},{"el":33,"sc":1,"sl":30}],"name":"LivePage","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3":{"methods":[{"sl":22},{"sl":30}],"name":"Signout","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":31},{"sl":32},{"sl":33}]},"test_9":{"methods":[{"sl":22},{"sl":25}],"name":"loginValidDetails","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":26},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3, 9], [3, 9], [3, 9], [9], [9], [9], [9], [], [3], [3], [3], [3], [], []]
