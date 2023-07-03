package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareCloseTray24: ImageVector
  get() {
    if (_shareCloseTray24 != null) {
      return _shareCloseTray24!!
    }
    _shareCloseTray24 = fluentIcon(name = "Filled.ShareCloseTray24", 24f) {
      materialPath {
          moveTo(4.25F, 20.0F)
          curveTo(3.007F, 20.0F, 2.0F, 18.993F, 2.0F, 17.75F)
          verticalLineTo(6.25F)
          curveTo(2.0F, 5.007F, 3.007F, 4.0F, 4.25F, 4.0F)
          horizontalLineToRelative(15.5F)
          curveTo(20.993F, 4.0F, 22.0F, 5.007F, 22.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 1.243F, -1.007F, 2.25F, -2.25F, 2.25F)
          horizontalLineTo(4.25F)
          close()
          moveToRelative(8.28F, -3.465F)
          lineToRelative(3.255F, -3.255F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          curveToRelative(-0.293F, -0.293F, -0.768F, -0.293F, -1.06F, 0.0F)
          lineToRelative(-1.975F, 1.974F)
          verticalLineTo(7.747F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(6.445F)
          lineTo(9.28F, 12.22F)
          curveToRelative(-0.292F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.292F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(3.25F, 3.255F)
          curveToRelative(0.14F, 0.14F, 0.33F, 0.22F, 0.53F, 0.22F)
          curveToRelative(0.199F, 0.0F, 0.39F, -0.08F, 0.53F, -0.22F)
          close()        
      }
    }
    return _shareCloseTray24!!
  }

private var _shareCloseTray24: ImageVector? = null
