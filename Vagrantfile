# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

  #config.vm.box = "precise64"
  #config.vm.box_url = "http://files.vagrantup.com/precise64.box"

  config.vm.box = "raringchef114"
  config.vm.box_url = "http://goo.gl/Y4aRr"

  config.vm.provider "virtualbox" do |v|
    v.gui = true
  end

  config.vm.provision :shell, :inline => 'apt-get install build-essential ruby1.9.1-dev --no-upgrade --yes'
  config.vm.provision :shell, :inline => "gem install chef --version 11.10.0 --no-rdoc --no-ri --conservative"

  config.vm.provision :chef_solo do |chef|
    chef.cookbooks_path = ["cookbooks"]
    chef.add_recipe :apt
    chef.add_recipe 'vim'
    chef.add_recipe 'git'
    chef.add_recipe 'tar'
    chef.add_recipe 'scala-ide'
    chef.json = {
      :git => {
        :prefix => "/usr/local"
      }
    }
  end
end
