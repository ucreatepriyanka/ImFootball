var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":277,"id":175,"methods":[{"el":29,"sc":2,"sl":25},{"el":43,"sc":2,"sl":32},{"el":61,"sc":2,"sl":46},{"el":78,"sc":2,"sl":63},{"el":95,"sc":2,"sl":80},{"el":112,"sc":2,"sl":97},{"el":129,"sc":2,"sl":114},{"el":147,"sc":2,"sl":132},{"el":165,"sc":2,"sl":150},{"el":184,"sc":2,"sl":169},{"el":202,"sc":2,"sl":187},{"el":220,"sc":2,"sl":205},{"el":239,"sc":2,"sl":223},{"el":246,"sc":2,"sl":242},{"el":255,"sc":2,"sl":249},{"el":263,"sc":2,"sl":258},{"el":275,"sc":2,"sl":266}],"name":"LoginTest","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":46}],"name":"loginInvalidDetails2","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_1":{"methods":[{"sl":25}],"name":"clickOnLoginButton","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]},"test_10":{"methods":[{"sl":249}],"name":"tabOnLoginwithFacebook","pass":true,"statements":[{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255}]},"test_11":{"methods":[{"sl":205}],"name":"loginInvalidDetails11","pass":true,"statements":[{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220}]},"test_12":{"methods":[{"sl":63}],"name":"loginInvalidDetails3","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78}]},"test_13":{"methods":[{"sl":169}],"name":"loginInvalidDetails9","pass":true,"statements":[{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184}]},"test_14":{"methods":[{"sl":258}],"name":"loginwithFB","pass":false,"statements":[{"sl":260}]},"test_15":{"methods":[{"sl":132}],"name":"loginInvalidDetails7","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147}]},"test_16":{"methods":[{"sl":187}],"name":"loginInvalidDetails10","pass":true,"statements":[{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202}]},"test_2":{"methods":[{"sl":114}],"name":"loginInvalidDetails6","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129}]},"test_3":{"methods":[{"sl":242}],"name":"Signout","pass":true,"statements":[{"sl":244},{"sl":245},{"sl":246}]},"test_4":{"methods":[{"sl":97}],"name":"loginInvalidDetails5","pass":true,"statements":[{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112}]},"test_5":{"methods":[{"sl":80}],"name":"loginInvalidDetails4","pass":false,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93}]},"test_6":{"methods":[{"sl":32}],"name":"loginInvalidDeatils1","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_7":{"methods":[{"sl":150}],"name":"loginInvalidDetails8","pass":true,"statements":[{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165}]},"test_8":{"methods":[{"sl":266}],"name":"createAnAccount","pass":false,"statements":[{"sl":268},{"sl":269}]},"test_9":{"methods":[{"sl":223}],"name":"loginValidDetails","pass":true,"statements":[{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1], [], [1], [1], [1], [], [], [6], [], [6], [6], [6], [6], [6], [6], [6], [6], [6], [6], [], [], [0], [], [0], [0], [0], [0], [0], [0], [0], [0], [0], [0], [0], [0], [0], [0], [], [12], [], [12], [12], [12], [12], [12], [12], [12], [12], [12], [12], [12], [12], [12], [12], [], [5], [], [5], [5], [5], [5], [5], [5], [5], [5], [5], [5], [5], [5], [], [], [], [4], [], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [4], [], [2], [], [2], [2], [2], [2], [2], [2], [2], [2], [2], [2], [2], [2], [2], [2], [], [], [15], [], [15], [15], [15], [15], [15], [15], [15], [15], [15], [15], [15], [15], [15], [15], [], [], [7], [], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [7], [], [], [], [13], [], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [13], [], [], [16], [], [16], [16], [16], [16], [16], [16], [16], [16], [16], [16], [16], [16], [16], [16], [], [], [11], [], [11], [11], [11], [11], [11], [11], [11], [11], [11], [11], [11], [11], [11], [11], [], [], [9], [], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [9], [], [], [3], [], [3], [3], [3], [], [], [10], [], [10], [10], [10], [10], [10], [], [], [14], [], [14], [], [], [], [], [], [8], [], [8], [8], [], [], [], [], [], [], [], [], [], [], []]