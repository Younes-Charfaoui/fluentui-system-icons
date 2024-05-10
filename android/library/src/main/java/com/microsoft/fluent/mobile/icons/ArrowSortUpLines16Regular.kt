package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSortUpLines16: ImageVector
  get() {
    if (_arrowSortUpLines16 != null) {
      return _arrowSortUpLines16!!
    }
    _arrowSortUpLines16 = fluentIcon(name = "Regular.ArrowSortUpLines16", 16f) {
      materialPath {
          moveTo(13.0F, 14.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          reflectiveCurveTo(12.0F, 14.776F, 12.0F, 14.5F)
          verticalLineTo(2.707F)
          lineToRelative(-1.146F, 1.147F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.196F, -0.195F, 0.512F, -0.195F, 0.708F, 0.0F)
          lineToRelative(2.0F, 2.0F)
          curveToRelative(0.195F, 0.196F, 0.195F, 0.512F, 0.0F, 0.708F)
          curveToRelative(-0.196F, 0.195F, -0.512F, 0.195F, -0.708F, 0.0F)
          lineTo(13.0F, 2.707F)
          verticalLineTo(14.5F)
          close()
          moveTo(2.5F, 13.0F)
          curveTo(2.224F, 13.0F, 2.0F, 12.776F, 2.0F, 12.5F)
          reflectiveCurveTo(2.224F, 12.0F, 2.5F, 12.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, 0.224F, 0.5F, 0.5F)
          reflectiveCurveTo(9.776F, 13.0F, 9.5F, 13.0F)
          horizontalLineToRelative(-7.0F)
          close()
          moveToRelative(2.0F, -3.0F)
          curveTo(4.224F, 10.0F, 4.0F, 9.776F, 4.0F, 9.5F)
          reflectiveCurveTo(4.224F, 9.0F, 4.5F, 9.0F)
          horizontalLineToRelative(5.0F)
          curveTo(9.776F, 9.0F, 10.0F, 9.224F, 10.0F, 9.5F)
          reflectiveCurveTo(9.776F, 10.0F, 9.5F, 10.0F)
          horizontalLineToRelative(-5.0F)
          close()
          moveTo(6.0F, 6.5F)
          curveTo(6.0F, 6.776F, 6.224F, 7.0F, 6.5F, 7.0F)
          horizontalLineToRelative(3.0F)
          curveTo(9.776F, 7.0F, 10.0F, 6.776F, 10.0F, 6.5F)
          reflectiveCurveTo(9.776F, 6.0F, 9.5F, 6.0F)
          horizontalLineToRelative(-3.0F)
          curveTo(6.224F, 6.0F, 6.0F, 6.224F, 6.0F, 6.5F)
          close()        
      }
    }
    return _arrowSortUpLines16!!
  }

private var _arrowSortUpLines16: ImageVector? = null
