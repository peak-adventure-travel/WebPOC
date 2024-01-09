try {
    importScripts(
        "constants.js",
        "edge_chromium_variables_default.js",
        "edge_chromium_variables_init.js",
        "edge_chromium_common.js",
        "background.js"
    );
} catch (e) {
    console.log(e);
}