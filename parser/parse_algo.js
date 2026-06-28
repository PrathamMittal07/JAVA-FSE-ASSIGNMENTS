const mammoth = require('mammoth');
const path = require('path');

const docxPath = path.join(__dirname, '..', 'Digital-Nurture-JavaFSE', 'Java FSE', 'Deepskilling', 'Engineering concepts', 'Algorithms_Data Structures.docx');

// Read Docx
try {
    mammoth.extractRawText({path: docxPath})
        .then(function(result){
            var text = result.value;
            // Since we want Exercise 2, let's just print out a chunk of text that hopefully contains it.
            // Or better, let's find the index of "Exercise 2" and print around it.
            let idx = text.indexOf("Exercise 2");
            if (idx !== -1) {
                console.log(text.substring(idx, idx + 3000));
            } else {
                console.log("Exercise 2 not found! First 2000 chars:");
                console.log(text.substring(0, 2000));
            }
        })
        .catch(function(err){
            console.error("Error reading Docx:", err);
        });
} catch (e) {
    console.error("Error with mammoth:", e);
}
