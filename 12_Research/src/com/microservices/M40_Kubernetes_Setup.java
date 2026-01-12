package com.microservices;

public class M40_Kubernetes_Setup {

    public static void main(String[] args) {

        String uiSetup = """
                -> To setup Kubernetes UI first setup helm.
                -> Setup helm using https://helm.sh/ 
                -> Execute below command
                   helm repo add kubernetes-dashboard https://kubernetes.github.io/dashboard/
                -> To install kubernetes dashboard execute below command
                   helm upgrade --install kubernetes-dashboard kubernetes-dashboard/kubernetes-dashboard --create-namespace --namespace kubernetes-dashboard
                -> Execute below command to run dashboard
                   kubectl -n kubernetes-dashboard port-forward svc/kubernetes-dashboard-kong-proxy 8443:443
                -> Follow the steps 
                   https://github.com/kubernetes/dashboard/blob/master/docs/user/access-control/creating-sample-user.md
                ->
                """;
    }
}
