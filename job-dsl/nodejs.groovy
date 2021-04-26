job ('nodejs job')
{
    scm{
        git(https://github.com/duzymic1/testnode.git) {node ->
            node / gitCongifName('DSL script')
            node / gitConfigEmail('script@wp.pl')
        }
    }

    triggers{
        scm('H/5 * * * *')
    }

    wrappers{
        nodejs('nodejs')
    }

    steps{
        shell('npm test')    
    }
}