package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseWifi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.5f, 13.866f)
                arcToRelative(4f, 4f, 0f, false, true, 5f, .01f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, .709f, -1.528f)
                lineToRelative(7f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 2.582f, 0f)
                lineToRelative(7f, 6f)
                arcTo(2f, 2f, 0f, false, true, 21f, 10f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10.754f)
                arcToRelative(8f, 8f, 0f, false, true, 10f, 0f)
            }
}

public val LucideIcons.All.HouseWifiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseWifi: ImageVector
    @Composable get() = HouseWifiDefinition.asImageVector()
