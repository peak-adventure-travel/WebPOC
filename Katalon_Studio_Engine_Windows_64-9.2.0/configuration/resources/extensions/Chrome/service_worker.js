try {
    importScripts(
        "constants.js",
        "chrome_variables_default.js",
        "chrome_variables_init.js",
        "chrome_common.js",
        "background.js"
    );
} catch (e) {
    console.log(e);
}