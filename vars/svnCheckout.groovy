def svnCheckout(String repoUrl, String credentialsId) {
    checkout([$class: 'SubversionSCM',
              locations: [[credentialsId: 'Ram',
                           remote: 'https://awchnsvr05.ant.works/svn/CMRPlus/Platform_React_Core/branches/CMR_API_Core']],
              workspaceUpdater: [$class: 'UpdateUpdater']])
}
