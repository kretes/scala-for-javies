package "xfce4" do 
	action :install
end

#package "xfce4-utils" do
#	action :install
#end

node.default['java']['oracle']['accept_oracle_download_terms']=true
node.default['java']['jdk_version']='7'
node.default['java']['install_flavor']="oracle"
include_recipe "java"

node.default['scala']['version']="2.10.3"
node.default['scala']['url']="http://www.scala-lang.org/files/archive/scala-2.10.3.tgz"
include_recipe "scala"

include_recipe "intellij-idea"

