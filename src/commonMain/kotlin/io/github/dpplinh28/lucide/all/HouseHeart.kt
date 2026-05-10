package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.62f, 13.8f)
                arcTo(2.25f, 2.25f, 0f, true, true, 12f, 10.836f)
                arcToRelative(2.25f, 2.25f, 0f, true, true, 3.38f, 2.966f)
                lineToRelative(-2.626f, 2.856f)
                arcToRelative(.998f, .998f, 0f, false, true, -1.507f, 0f)
                close()
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
}

public val LucideIcons.All.HouseHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseHeart: ImageVector
    @Composable get() = HouseHeartDefinition.asImageVector()
