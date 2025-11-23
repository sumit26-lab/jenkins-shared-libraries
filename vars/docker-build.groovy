def (String DockerHubUser,String ProjectName,String ImageTage){
      echo "image tage process Start"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage}

}
