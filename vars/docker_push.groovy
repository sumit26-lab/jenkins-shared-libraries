def call(String dockerhubUser, String ProjectName,ImageTage){
                withCredentials([usernamePassword(credentialsId: 'dockerhubCred', 
                usernameVariable: 'DOCKER_HUB_USER',
                passwordVariable: 'DOCKER_HUB_PASS')]) {
                
                // loginDocker hub
                sh "docker login -u ${env.DOCKER_HUB_USER} -p ${env.DOCKER_HUB_PASS}"
                // create image tage
          
                sh "docker push ${env.DOCKER_HUB_USER}/${ProjectName}:${ImageTage}"
                echo "image on push docker hub"
                
                }
}
