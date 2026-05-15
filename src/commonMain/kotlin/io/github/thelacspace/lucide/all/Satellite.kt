package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Satellite") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13.5f, 6.5f)
                lineToRelative(-3.148f, -3.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineTo(6.352f, 5.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineTo(9.5f, 10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f, 7.5f)
                lineTo(19f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.5f, 10.5f)
                lineToRelative(3.148f, 3.148f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, 0f, 1.704f)
                lineToRelative(-2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, true, -1.704f, 0f)
                lineTo(13.5f, 14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.352f, 10.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(4.296f, -4.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, -1.704f)
                lineToRelative(-2.296f, -2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                close()
            }
}

public val LucideIcons.All.SatelliteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Satellite: ImageVector
    @Composable get() = SatelliteDefinition.asImageVector()
