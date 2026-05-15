package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquircleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.77f, 3.043f)
                arcToRelative(34f, 34f, 0f, false, false, -3.54f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.771f, 20.956f)
                arcToRelative(33f, 33f, 0f, false, true, -3.541f, .001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18f, 17.74f)
                curveToRelative(-.51f, 1.15f, -1.29f, 1.93f, -2.439f, 2.44f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18f, 6.259f)
                curveToRelative(-.51f, -1.148f, -1.291f, -1.929f, -2.44f, -2.438f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.957f, 10.23f)
                arcToRelative(33f, 33f, 0f, false, true, 0f, 3.54f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.043f, 10.23f)
                arcToRelative(34f, 34f, 0f, false, false, .001f, 3.541f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f, 20.179f)
                curveToRelative(-1.15f, -.508f, -1.93f, -1.29f, -2.44f, -2.438f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f, 3.82f)
                curveToRelative(-1.149f, .51f, -1.93f, 1.291f, -2.44f, 2.44f)
            }
}

public val LucideIcons.All.SquircleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquircleDashed: ImageVector
    @Composable get() = SquircleDashedDefinition.asImageVector()
