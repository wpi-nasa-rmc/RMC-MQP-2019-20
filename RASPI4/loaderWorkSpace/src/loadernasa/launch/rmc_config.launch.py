from launch import LaunchDescription
from launch_ros.actions import Node


def generate_launch_description():
    return LaunchDescription([
	Node(
    		package='loadernasa',
    		node_namespace='rmc_nodes',
    		node_executable='heroPi4Client',
   		node_name='heroP14Client'
	),
	Node(
    		package='loadernasa',
    		node_namespace='rmc_nodes',
    		node_executable='pi4HeroService',
    		node_name='pi4HeroService'
	),
    ])
