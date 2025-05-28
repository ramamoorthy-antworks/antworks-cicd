def call(String repoUrl, String credentialsId='Ram' ) {
    checkout([
        $class: 'SubversionSCM',
        additionalCredentials: [],
        excludedCommitMessages: '',
        excludedRegions: '',
        excludedRevprop: '',
        excludedUsers: '',
        filterChangelog: false,
        ignoreDirPropChanges: false,
        includedRegions: '',
        locations: [[
            cancelProcessOnExternalsFail: true,
            credentialsId: credentialsId,
            depthOption: 'infinity',
            ignoreExternalsOption: true,
            local: '.', 
            remote: repoUrl
        ]],
        quietOperation: true,
        workspaceUpdater: [$class: 'CheckoutUpdater']
    ])
}
