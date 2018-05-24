var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":32,"methods":[{"el":20,"sc":1,"sl":18},{"el":23,"sc":1,"sl":21},{"el":26,"sc":1,"sl":24}],"name":"HomePage","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":18},{"sl":24}],"name":"clickOnLoginButton","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":25},{"sl":26}]},"test_10":{"methods":[{"sl":18},{"sl":24}],"name":"tabOnLoginwithFacebook","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":25},{"sl":26}]},"test_8":{"methods":[{"sl":18},{"sl":24}],"name":"createAnAccount","pass":false,"statements":[{"sl":19},{"sl":20},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 8, 10], [1, 8, 10], [1, 8, 10], [], [], [], [1, 8, 10], [1, 8, 10], [1, 10], [], [], []]
