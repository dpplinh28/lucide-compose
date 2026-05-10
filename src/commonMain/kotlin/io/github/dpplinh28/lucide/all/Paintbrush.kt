package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Paintbrush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14.622f, 17.897f)
                lineToRelative(-10.68f, -2.913f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.376f, 2.622f)
                arcToRelative(1f, 1f, 0f, true, true, 3.002f, 3.002f)
                lineTo(17.36f, 9.643f)
                arcToRelative(.5f, .5f, 0f, false, false, 0f, .707f)
                lineToRelative(.944f, .944f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 0f, 3.408f)
                lineToRelative(-.944f, .944f)
                arcToRelative(.5f, .5f, 0f, false, true, -.707f, 0f)
                lineTo(8.354f, 7.348f)
                arcToRelative(.5f, .5f, 0f, false, true, 0f, -.707f)
                lineToRelative(.944f, -.944f)
                arcToRelative(2.41f, 2.41f, 0f, false, true, 3.408f, 0f)
                lineToRelative(.944f, .944f)
                arcToRelative(.5f, .5f, 0f, false, false, .707f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 8f)
                curveToRelative(-1.804f, 2.71f, -3.97f, 3.46f, -6.583f, 3.948f)
                arcToRelative(.507f, .507f, 0f, false, false, -.302f, .819f)
                lineToRelative(7.32f, 8.883f)
                arcToRelative(1f, 1f, 0f, false, false, 1.185f, .204f)
                curveTo(12.735f, 20.405f, 16f, 16.792f, 16f, 15f)
            }
}

public val LucideIcons.All.PaintbrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Paintbrush: ImageVector
    @Composable get() = PaintbrushDefinition.asImageVector()
