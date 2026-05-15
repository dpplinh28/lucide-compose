package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardDriveDownload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 6f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 18f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 18f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.HardDriveDownloadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardDriveDownload: ImageVector
    @Composable get() = HardDriveDownloadDefinition.asImageVector()
