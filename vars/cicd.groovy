def gitDownload(repo)
{
   git "https://github.com/sailaja-web/${repo}.git"
}

def buildArtifact()
{
   sh "mvn package"
}
