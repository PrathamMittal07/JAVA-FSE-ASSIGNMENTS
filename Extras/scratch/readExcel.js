const xlsx = require('xlsx');
const workbook = xlsx.readFile('E:\\\\Java Fse\\\\Digital-Nurture-JavaFSE\\\\Java FSE\\\\Deepskilling\\\\DN - Java FSE Mandatory hands-on detail.xlsx');
const sheetName = workbook.SheetNames[0];
const sheet = workbook.Sheets[sheetName];
const data = xlsx.utils.sheet_to_json(sheet);
console.log(JSON.stringify(data, null, 2));
