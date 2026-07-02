const mammoth = require('mammoth');
const path = require('path');

const docxPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'Engineering concepts', 'Algorithms_Data Structures.docx');

// Read Docx
try {
    mammoth.extractRawText({path: docxPath})
        .then(function(result){
            var text = result.value;
            let idx = text.indexOf("Exercise 7");
            if (idx !== -1) {
                console.log(text.substring(idx, idx + 3000));
            } else {
                console.log("Exercise 7 not found!");
            }
        })
        .catch(function(err){
            console.error("Error reading Docx:", err);
        });
} catch (e) {
    console.error("Error with mammoth:", e);
}
