def call(String project, String ImgeTag, String hubUser){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker iamge tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}

