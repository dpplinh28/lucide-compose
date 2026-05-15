package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 18f)
                lineToRelative(-1.535f, 1.605f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -1.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.996f, 15.251f)
                arcTo(4.5f, 4.5f, 0f, false, false, 17.495f, 8f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(7f, 7f, 0f, true, false, -12.709f, 5.607f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 14f)
                lineToRelative(1.535f, -1.605f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 1.5f)
            }
}

public val LucideIcons.All.CloudSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSync: ImageVector
    @Composable get() = CloudSyncDefinition.asImageVector()
