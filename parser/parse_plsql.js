const mammoth = require('mammoth');
const path = require('path');

const docxPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'PL SQL programming', 'PLSQL_Exercises.docx');

// Read Docx
try {
    mammoth.extractRawText({path: docxPath})
        .then(function(result){
            var text = result.value;
            let idx = text.indexOf("Exercise 1");
            if (idx !== -1) {
                console.log(text.substring(idx, idx + 3000));
            } else {
                console.log("Exercise 1 not found! First 2000 chars:");
                console.log(text.substring(0, 2000));
            }
        })
        .catch(function(err){
            console.error("Error reading Docx:", err);
        });
} catch (e) {
    console.error("Error with mammoth:", e);
}
