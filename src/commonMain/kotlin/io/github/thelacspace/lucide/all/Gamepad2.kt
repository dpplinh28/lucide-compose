package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                lineTo(10f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 9f)
                lineTo(8f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                lineTo(15.01f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 10f)
                lineTo(18.01f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.32f, 5f)
                horizontalLineTo(6.68f)
                arcToRelative(4f, 4f, 0f, false, false, -3.978f, 3.59f)
                curveToRelative(-.006f, .052f, -.01f, .101f, -.017f, .152f)
                curveTo(2.604f, 9.416f, 2f, 14.456f, 2f, 16f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                curveToRelative(1f, 0f, 1.5f, -.5f, 2f, -1f)
                lineToRelative(1.414f, -1.414f)
                arcTo(2f, 2f, 0f, false, true, 9.828f, 16f)
                horizontalLineToRelative(4.344f)
                arcToRelative(2f, 2f, 0f, false, true, 1.414f, .586f)
                lineTo(17f, 18f)
                curveToRelative(.5f, .5f, 1f, 1f, 2f, 1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                curveToRelative(0f, -1.545f, -.604f, -6.584f, -.685f, -7.258f)
                curveToRelative(-.007f, -.05f, -.011f, -.1f, -.017f, -.151f)
                arcTo(4f, 4f, 0f, false, false, 17.32f, 5f)
                close()
            }
}

public val LucideIcons.All.Gamepad2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad2: ImageVector
    @Composable get() = Gamepad2Definition.asImageVector()
