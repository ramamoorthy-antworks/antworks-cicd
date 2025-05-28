def svnCheckout(String repoUrl, String credentialsId) {
    checkout([$class: 'SubversionSCM',
              locations: [[credentialsId: credentialsId,
                           remote: repoUrl]],
              workspaceUpdater: [$class: 'UpdateUpdater']])
}
