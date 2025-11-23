def (String DockerHubUser,String ProjectName,String ImageTage){
      echo "image tage process Start"
     echo "DockerHubUser = ${DockerHubUser}"
     echo "ProjectName = ${ProjectName}"
     echo "ImageTage = ${ImageTage}"
      
    sh """
      docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage} .
      """

}
