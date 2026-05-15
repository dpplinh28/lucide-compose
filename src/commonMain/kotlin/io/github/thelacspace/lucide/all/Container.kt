package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Container") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 7.7f)
                curveToRelative(0f, -.6f, -.4f, -1.2f, -.8f, -1.5f)
                lineToRelative(-6.3f, -3.9f)
                arcToRelative(1.72f, 1.72f, 0f, false, false, -1.7f, 0f)
                lineToRelative(-10.3f, 6f)
                curveToRelative(-.5f, .2f, -.9f, .8f, -.9f, 1.4f)
                verticalLineToRelative(6.6f)
                curveToRelative(0f, .5f, .4f, 1.2f, .8f, 1.5f)
                lineToRelative(6.3f, 3.9f)
                arcToRelative(1.72f, 1.72f, 0f, false, false, 1.7f, 0f)
                lineToRelative(10.3f, -6f)
                curveToRelative(.5f, -.3f, .9f, -1f, .9f, -1.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 21.9f)
                verticalLineTo(14f)
                lineTo(2.1f, 9.1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(10f, 14f)
                lineToRelative(11.9f, -6.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 19.8f)
                verticalLineToRelative(-8.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17.5f)
                verticalLineTo(9.4f)
            }
}

public val LucideIcons.All.ContainerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Container: ImageVector
    @Composable get() = ContainerDefinition.asImageVector()
