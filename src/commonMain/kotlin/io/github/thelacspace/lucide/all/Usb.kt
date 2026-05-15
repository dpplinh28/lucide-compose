package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Usb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.7f, 19.3f)
                lineTo(19f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 3f)
                lineToRelative(-3f, 1f)
                lineToRelative(2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.26f, 7.68f)
                lineTo(5f, 12f)
                lineToRelative(2f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(10f, 14f)
                lineToRelative(5f, 2f)
                lineToRelative(3.5f, -3.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18f, 12f)
                lineToRelative(1f, -1f)
                lineToRelative(1f, 1f)
                lineToRelative(-1f, 1f)
                close()
            }
}

public val LucideIcons.All.UsbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Usb: ImageVector
    @Composable get() = UsbDefinition.asImageVector()
