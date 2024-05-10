package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.CloudOff28: ImageVector
  get() {
    if (_cloudOff28 != null) {
      return _cloudOff28!!
    }
    _cloudOff28 = fluentIcon(name = "Filled.CloudOff28", 28f) {
      materialPath {
          moveTo(3.28F, 2.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(5.54F, 5.542F)
          curveToRelative(-0.344F, 0.676F, -0.583F, 1.415F, -0.692F, 2.195F)
          curveTo(4.233F, 11.237F, 2.0F, 13.607F, 2.0F, 16.5F)
          curveTo(2.0F, 19.538F, 4.462F, 22.0F, 7.5F, 22.0F)
          horizontalLineToRelative(13.0F)
          curveToRelative(0.142F, 0.0F, 0.283F, -0.005F, 0.423F, -0.016F)
          lineToRelative(3.796F, 3.796F)
          curveToRelative(0.293F, 0.293F, 0.768F, 0.293F, 1.061F, 0.0F)
          curveToRelative(0.293F, -0.292F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineTo(3.28F, 2.22F)
          close()
          moveToRelative(6.396F, 4.275F)
          lineToRelative(14.282F, 14.282F)
          curveTo(25.204F, 19.768F, 26.0F, 18.227F, 26.0F, 16.5F)
          curveToRelative(0.0F, -2.892F, -2.233F, -5.263F, -5.069F, -5.483F)
          curveTo(20.453F, 7.616F, 17.532F, 5.0F, 14.0F, 5.0F)
          curveToRelative(-1.632F, 0.0F, -3.133F, 0.558F, -4.324F, 1.495F)
          close()        
      }
    }
    return _cloudOff28!!
  }

private var _cloudOff28: ImageVector? = null
