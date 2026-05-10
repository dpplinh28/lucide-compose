package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneCall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 2f)
                arcToRelative(9f, 9f, 0f, false, true, 9f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 6f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.832f, 16.568f)
                arcToRelative(1f, 1f, 0f, false, false, 1.213f, -.303f)
                lineToRelative(.355f, -.465f)
                arcTo(2f, 2f, 0f, false, true, 17f, 15f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcTo(18f, 18f, 0f, false, true, 2f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, -.8f, 1.6f)
                lineToRelative(-.468f, .351f)
                arcToRelative(1f, 1f, 0f, false, false, -.292f, 1.233f)
                arcToRelative(14f, 14f, 0f, false, false, 6.392f, 6.384f)
            }
}

public val LucideIcons.All.PhoneCallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneCall: ImageVector
    @Composable get() = PhoneCallDefinition.asImageVector()
