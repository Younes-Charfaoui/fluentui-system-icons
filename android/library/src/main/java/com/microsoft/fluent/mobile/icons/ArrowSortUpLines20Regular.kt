package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSortUpLines20: ImageVector
  get() {
    if (_arrowSortUpLines20 != null) {
      return _arrowSortUpLines20!!
    }
    _arrowSortUpLines20 = fluentIcon(name = "Regular.ArrowSortUpLines20", 20f) {
      materialPath {
          moveTo(15.0F, 17.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(14.0F, 17.776F, 14.0F, 17.5F)
          verticalLineTo(3.707F)
          lineToRelative(-2.146F, 2.147F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, 3.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(15.0F, 3.707F)
          verticalLineTo(17.5F)
          close()
          moveTo(2.5F, 16.0F)
          curveTo(2.224F, 16.0F, 2.0F, 15.776F, 2.0F, 15.5F)
          reflectiveCurveTo(2.224F, 15.0F, 2.5F, 15.0F)
          horizontalLineToRelative(9.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(11.776F, 16.0F, 11.5F, 16.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(5.0F, 12.5F)
          curveTo(5.0F, 12.776F, 5.224F, 13.0F, 5.5F, 13.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(11.776F, 12.0F, 11.5F, 12.0F)
          horizontalLineToRelative(-6.0F)
          curveTo(5.224F, 12.0F, 5.0F, 12.224F, 5.0F, 12.5F)
          close()
          moveTo(8.5F, 10.0F)
          curveTo(8.224F, 10.0F, 8.0F, 9.776F, 8.0F, 9.5F)
          reflectiveCurveTo(8.224F, 9.0F, 8.5F, 9.0F)
          horizontalLineToRelative(3.0F)
          curveTo(11.776F, 9.0F, 12.0F, 9.224F, 12.0F, 9.5F)
          reflectiveCurveTo(11.776F, 10.0F, 11.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          close()        
      }
    }
    return _arrowSortUpLines20!!
  }

private var _arrowSortUpLines20: ImageVector? = null
