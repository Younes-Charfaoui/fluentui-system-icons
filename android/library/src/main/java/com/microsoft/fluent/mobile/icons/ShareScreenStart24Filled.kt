package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.ShareScreenStart24: ImageVector
  get() {
    if (_shareScreenStart24 != null) {
      return _shareScreenStart24!!
    }
    _shareScreenStart24 = fluentIcon(name = "Filled.ShareScreenStart24", 24f) {
      materialPath {
          moveTo(4.25F, 4.0F)
          curveTo(3.007F, 4.0F, 2.0F, 5.007F, 2.0F, 6.25F)
          verticalLineToRelative(11.5F)
          curveTo(2.0F, 18.993F, 3.007F, 20.0F, 4.25F, 20.0F)
          horizontalLineToRelative(15.5F)
          curveToRelative(1.243F, 0.0F, 2.25F, -1.007F, 2.25F, -2.25F)
          verticalLineTo(6.25F)
          curveTo(22.0F, 5.007F, 20.993F, 4.0F, 19.75F, 4.0F)
          horizontalLineTo(4.25F)
          close()
          moveToRelative(8.28F, 3.465F)
          lineToRelative(3.255F, 3.255F)
          curveToRelative(0.293F, 0.293F, 0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(-0.293F, 0.293F, -0.768F, 0.293F, -1.06F, 0.0F)
          lineTo(12.75F, 9.806F)
          verticalLineToRelative(6.447F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          reflectiveCurveToRelative(-0.75F, -0.336F, -0.75F, -0.75F)
          verticalLineTo(9.808F)
          lineTo(9.28F, 11.78F)
          curveToRelative(-0.292F, 0.293F, -0.767F, 0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, -0.292F, -0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(3.25F, -3.255F)
          curveToRelative(0.14F, -0.14F, 0.33F, -0.22F, 0.53F, -0.22F)
          curveToRelative(0.199F, 0.0F, 0.39F, 0.08F, 0.53F, 0.22F)
          close()        
      }
    }
    return _shareScreenStart24!!
  }

private var _shareScreenStart24: ImageVector? = null
