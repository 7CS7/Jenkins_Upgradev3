mavenJob('test') {
  description 'Build job for Jenkins Test'

  

  

  scm {
    git ("https://github.com/7CS7/Jenkins_Upgradev3.git",master)
}

  triggers {
    scm '* * * * *'
    
  }
steps{
maven('clean package','maven-samples/single-module/pom.xml')
}

  publishers{
archieveArtifacts '**/*'
}

}
