package tools.phonograph


fun main() {
//    download()
    val jsons = parse()
    export(jsons)
//    downloadFiles(jsons)
//    generateReleaseDeletionScript(jsons)
    generateGitTagDeletionScript(jsons)
}